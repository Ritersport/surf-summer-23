package nsu.leorita.surfapp.ui.base

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.Completable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

open class BaseViewModel : ViewModel() {

    private val subscriptions: CompositeDisposable = CompositeDisposable()

    @Suppress("PropertyName")
    protected val _showErrorDialog = SingleLiveEvent<Throwable>()
    val showErrorDialog: LiveData<Throwable> = _showErrorDialog

    @Suppress("PropertyName")
    protected val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    override fun onCleared() {
        super.onCleared()
        subscriptions.clear()
    }

    protected inline fun <T> Single<T>.setupDefaultSchedulers(): Single<T> =
        this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

    protected inline fun Completable.setupDefaultSchedulers(): Completable =
        this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())


    protected fun Disposable.unsubscribeOnCleared() {
        subscriptions.add(this)
    }

    fun onError(e: Throwable) {
        Log.e("BaseViewModelErrorHandler", e.stackTraceToString())
    }

    fun onDismiss() = subscriptions.clear()
}