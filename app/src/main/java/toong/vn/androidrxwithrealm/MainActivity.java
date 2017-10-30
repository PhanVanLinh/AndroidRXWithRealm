package toong.vn.androidrxwithrealm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import io.realm.Realm;
import rx.Observable;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName();
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realm = Realm.getDefaultInstance();
        a().subscribe();
    }

    public Observable<Integer> a(){
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(final Subscriber<? super Integer> subscriber) {
                try {
                    for(int i = 0; i < 1000; i++){
                        Log.i(TAG, "i = "+i);
                        bc(i);
                    }
                } catch (OutOfMemoryError ex) {
                    subscriber.onError(ex);
                }
            }
        });
    }

    private void bc(final int i){
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Dog dog = new Dog();
                dog.setName("Realm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the appRealm for Android is built upon an embedded storage engine. The storage engine does not allocate memory on the JVM heap but in native memory. When the storage engine cannot allocate native memory or the file system is full, Realm will throw an java.lang.OutOfMemoryError exception. It is important to not ignore this error. If your app continues running, accessing the Realm file might leave it in a corrupted or an inconsistent state. It is safest to terminate the app"+i);
                dog.setAge(1+i);
                realm.insert(dog);
            }
        });
//        realm.executeTransaction(new Realm.Transaction() {
//            @Override
//            public void execute(Realm bgRealm) {
//
//            }
//        }, new Realm.Transaction.OnSuccess() {
//            @Override
//            public void onSuccess() {
//            }
//        });
    }
}
