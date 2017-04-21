package ankit.developer.unknowns.aboutpage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * Created by ankitsharma on 4/21/2017.
 */

public class About extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        Element adsElement = new Element();

        adsElement.setTitle("Advertise here");



        View aboutPage = new AboutPage(this)

                .isRTL(false)

                .setImage(R.drawable.about_icon_instagram)

                .setDescription("This is demo version")

                .addItem(new Element().setTitle("Version 1.0"))

                .addItem(adsElement)

                .addGroup("Connect with me")

                .addEmail("eddydn@gmail.com")

                .addWebsite("http://edmtdev.com")

                .addFacebook("EDMTDev")

                .addTwitter("My Twitter")

                .addYoutube("UCllewj2bGdqB8U9Ld15INAg")

                .addPlayStore("My PlayStore")

                .addInstagram("My Instagram")

                .addGitHub("eddydn")

                .addItem(createCopyright())

                .create();



        setContentView(aboutPage);

    }



    private Element createCopyright() {

        final Element copyright = new Element();

        final String copyrightString = String.format("Copyright %d by EDMTDev", Calendar.getInstance().get(Calendar.YEAR));

        copyright.setTitle(copyrightString);

        copyright.setIcon(R.mipmap.ic_launcher);

        copyright.setGravity(Gravity.CENTER);

        copyright.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Toast.makeText(About.this,copyrightString,Toast.LENGTH_SHORT).show();

            }

        });

        return copyright;

    }
}
