package in.countrybaskets.signupandsignin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uicomponents extends AppCompatActivity {
Button notification;
private final String Channel_id="simple notifi";
private final int notification_id=123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uicomponents);
        notification = findViewById(R.id.notification);

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createNotification();
                addNotification();
            }


        });



    }

    private void addNotification() {
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext(),Channel_id);
        builder.setSmallIcon(R.drawable.ic_baseline_accessible_24);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.toast));
        builder.setContentTitle("simple notification");
        builder.setContentText("hi i am from india");
        builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeResource(getResources(),R.drawable.toast)));
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManagerCompat nmc=NotificationManagerCompat.from(getApplicationContext());
        nmc.notify(notification_id,builder.build());
    }

    private void createNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "simple notification";
            String data = "This is just some sample data";
            NotificationChannel notificationChannel = new NotificationChannel(Channel_id, name, NotificationManager.IMPORTANCE_DEFAULT);
            notificationChannel.setDescription(data);

            NotificationManager nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
            nm.createNotificationChannel(notificationChannel);
        }
        }
}