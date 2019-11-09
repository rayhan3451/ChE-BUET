package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/29/2018.
 */

public class FragmentChesixty extends Fragment {
    View view;
    public FragmentChesixty() {
    }
    private WebView webView59;
    String chesixtytext="<h3><b><strong>Economics and Management of Chemical Process Industries</strong></b></h3>"+
            "<h4><b><strong>4.00 credits, 4 hours/week</strong></b></h4>"+

            "<p><em>Economic environment. National economic policies. Five Year Plans and sectoral plans." +
            " Concepts of value added and technology content added. Elements of input-output analysis. " +
            "Alternatives in resource inputs. Investment costs. Interest calculations. Economic balance:" +
            " Depreciation, Profitability and alternative investments. Project analysis: DCF, IRR, ERR etc." +
            " Elements of risk analysis. Break even analysis and Minimum cost analysis. Capital budgeting." +
            " Functions of management in CPI: decision making: organizing, planning, directing, communicating, " +
            "and controlling. Information management. Principles of production management. Marketing Management " +
            "of public sector. Quantitative techniques in decision making: Network analysis. Linear programming." +
            " Decision making under uncertainty.</em></p><br><br>";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.chesixty_fragment,container,false);
        webView59 = (WebView) view.findViewById(R.id.subsixty);
        webView59.loadDataWithBaseURL(null,chesixtytext,"text/html","utf-8",null);

        return view;
    }
}
