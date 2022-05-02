package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User u = new User("Name", "Description", 00, false);

        Button followButton = (Button) findViewById(R.id.Follow);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (u.Followed == true){
                    u.Followed = false;
                    followButton.setText("Follow");
                }
                else {
                    u.Followed = true;
                    followButton.setText("Unfollow");
                }
            }
        });

    }
}