package com.che.chemical.buet;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class about_chemical extends FragmentActivity {

    private WebView webView3451;
    String aboutchemicaltext="<h2><b><strong><center><u>Welcome to the Department of Chemical Engineering</u></center></strong></b></h2><br>"+

            "<p>The Department of Chemical Engineering of the Bangladesh University of Engineering " +
            "and Technology was started in the early days of the Ahsanullah Engineering College. " +
            "Since then, the hundreds of Chemical Engineers who have graduated from this department " +
            "have played a vital role in the development and improvement of various chemical and allied" +
            " industries both at home and abroad. The versatility in this field of study has allowed the" +
            " graduates to flourish in almost every sector of the economy.</p><br>"+

            "<p>The department now offers B.Sc. Engineering, M.Sc. Engineering, M. Engineering and Ph.D. " +
            "degrees in chemical engineering. The courses offered in this department are designed within " +
            "the modern concepts of chemical engineering education with due emphasis on the industrial " +
            "requirements in the country.</p><br>"+

            "<p>The department has about 300 undergraduate and 50 graduate students and 18 regular faculty " +
            "members. Dr. Syeda Sultana Razia is the current head of this department</p><br><br>"+

            "<h2><b><strong><center>Faculty</center></strong></b></h2>"+
            "<p><b>Professor and Head</b><br>Dr. Syeda Sultana Razia, B.Sc. Engg (Chem), M.Sc. Engg., Ph.D.</p><br>"+
            "<p><b><em>Professor Emeritus</em></b><br>Dr. Iqbal Mahmud, B.Sc. Engg (Chem), M.Sc. Tech., Ph.D.</p><br>"+
            "<p><b><em>Professors</em></b><br>Dr. M. Sabder Ali, B.Sc. Engg (Chem), Ph.D.<br>Dr. Dil Afroza Begum, M.Sc., Ph.D.<br>Dr. Ijaz Hossain, B.Sc. Engg (Chem), M.Sc. Engg., Ph.D.<br>Dr. M.A.A. Shoukat Choudhury, B.Sc. Engg (Chem), M.Sc. Engg., Ph.D.</p><br>"+
            "<p><b><em>Associate Professors</em></b><br>Sirajul Haque Khan, B.Sc. Engg (Chem), M.Sc. Engg.</p><br>"+
            "<p><b><em>Assistant Professors</em></b><br>Dr. Md. Ruhul Amin, B.Sc. Engg (Chem), M.Sc. Engg., Ph.D.<br>M. Mominur Rahman, B.Sc. Engg (Chem), M.Sc. Engg.<br>Dr. Md. Tanvir Sowgath, B.Sc. Engg (Chem), M.Sc. Engg., Ph.D.<br>Dr. Md. Iqbal Hossain, B.Sc. Engg (Chem), Ph.D.<br>Syeda Zohra Halim, B.Sc. Engg (Chem), M.Sc. Engg</p><br>"+
            "<p><b><em>Lecturers</em></b><br>Shah Md. Toufiqur Rahman, B.Sc. Engg (Chem)<br>Lubna Ahmed, B.Sc. Engg (Chem)<br>Tania Tabassum Emi, B.Sc. Engg (Chem)<br>Dr. Md. Easir Arafat Khan, B.Sc. Engg (Chem), Ph.D.<br>Kaniz Fatema, B.Sc. Engg (Chem)</p><br>"+

            "<p><b><strong><center>INTRODUCTION TO ONLINE REGISTRATION PROCEDURE</center></strong></b></p>"+
            "<p>Students will have to perform their course registration online. Prior to this, students must collect" +
            " their Account ID and Password from their respective halls. The students must meet their advisers before " +
            "the registration to talk about the registration and the courses to be taken. The web address for online " +
            " registration is <u><em>http://biis.buet.ac.bd</em></u> . Offered courses for each term will be available in the webpage," +
            " along with the class routine, academic calendar and exam schedule. Students must check " +
            "if their class routine and exam schedule overlap or not. Once the registration has been done, " +
            "students must recheck if the status of their registration process is complete. Add/drop of courses" +
            " must be performed within the specified time limit, along with the course teacher’s consent and" +
            " the adviser’s permission. Students must recheck if the process is complete or not.</p><br>"+

            "<center><p><b><strong>SUMMARY OF CREDIT HOURS</strong></b></p></center>"+

            "<p>Level 1 Term 1, Theory=15, Sessional=4.5<br>Level 1 Term 2, Theory=14, Sessional=6.0<br>Level 2 Term 1, Theory=16, Sessional=4.5<br>Level 2 Term 2, Theory=15, Sessional=4.5<br>Level 3 Term 1, Theory=15, Sessional=4.5<br>Level 3 Term 2, Theory=16, Sessional=4.5<br>Level 4 Term 1, Theory=15, Sessional=6.0<br>Level 4 Term 2, Theory=12, Sessional=6.0</p>"+

            "<p><em>Total: Theory=118 , Sessional=40.5</em></p><br>"+

            "<center><p><b><strong><u>Job field for Chemical Engineers</u></strong></b></p></center>"+

            "<p>Fertilizer factory<br>Paper mill<br>Sugar mill<br>Glass and ceramic industries<br>Paints Factory<br>Pharmaceutical industry<br>Food and Beverage Company<br>Textile companies<br>Cosmetic company<br>Petroleum<br>Nuclear plant<br>Cement factory<br>Oil extraction and refinement<br>Tannery Industry<br><br></p><br><br>";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_chemical);

        webView3451 = (WebView) findViewById(R.id.ChemSlider2);
        webView3451.loadDataWithBaseURL(null,aboutchemicaltext,"text/html","utf-8",null);
    }
}
