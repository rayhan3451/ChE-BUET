package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/28/2018.
 */

public class FragmentElectivethirtyseven extends Fragment {
    View view;
    public FragmentElectivethirtyseven() {
    }
    private WebView webView36;
    String electivethirtyseventext="<p><b><strong>(1) Hum 203 : Government (3 credits)</strong></b></p>"+
            "<p><b><strong>(2) Hum 201 : Sociology (3 credits)</strong></b></p>"+
            "<p><b><strong>(3) Hum 303 : Principles of Accounting (3 credits)</strong></b></p><br>"+

            "<h3><b><strong>(1) Government</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em><u>Scope</u>: Some fundamental concepts of government and politics.</em></p><br>"+
            "<p><em><u>Origin of the State:</u> Stages of development of modern state: nation, nationalism," +
            " internationalism, sovereignty: dejure and de-facto sovereignty. Functions of State: " +
            "individualism, socialism, welfare state, fascism.</em></p><br>"+

            "<p><em><u>Citizenship</u>: Rights, duties, hindrances to good citizenship.\n" +
            "<br><u>Forms of Government</u>: Aristotle’s Classification. Modern Classification:" +
            " democracy, dictatorship, cabinet, presidential, unitary and federal.</em></p><br>"+

            "<p><em>Organs of Government and Separation of Powers: Legislature," +
            " Executive, Judiciary, Bureaucracy.</em></p><br>"+

            "<p><em><u>The Electorate</u>: Party system and Public Opinion.\n" +
            "Local Self Government</em></p><br>"+

            "<p><em>Socio-political and economic background of the movement for Bangladesh.\n" +
            "Government and Politics in Bangladesh.\n" +
            "Some major administrative systems.</em></p><br>"+

            "<p><em>International Political Organization: The U.N.O. its Specialized agencies.</em></p><br><br>"+

            "<h3><b><strong>(2) Sociology</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em><u>Scope of Sociology</u>: Micro and Macro Sociology. Some fundamental concepts.</em></p><br>"+

            "<p><em><u>Society</u>: From savagery to civilization (Table).</em></p><br>"+

            "<p><em><u>Social evolution and Techniques of production</u>: Social structure of Bangladesh." +
            " Oriental and Occidental Societies Feudalism.</em></p><br>"+

            "<p><em><u>Industrial Revolution</u>: the growth of capitalism, features, social consequences. " +
            "Socialism. Fascism.</em></p><br>"+

            "<p><em><u>Social Control</u>: Need, means, future of social control.</em></p><br>"+

            "<p><em><u>Leadership</u>: Types, functions, techniques and social power.</em></p><br>"+

            "<p><em><u>Society and Population</u>: Social determinants of fertility and mortality. Human " +
            "migration. Demographic transition. Density, the standard of living. Population pyramid." +
            " Population and world resources. Malthusian, Optimum and socialistic population theory." +
            " Population problem of Bangladesh.</em></p><br>"+

            "<p><e><u>Social Pathology</u>: Crime, juvenile delinquency. Slum.</em></p><br>"+

            "<p><em>Nature of Social Change: Factors of Social Change: biological, physical; economic," +
            " cultural. Technological factor: Change in production technology, means of communication," +
            " transportation. Derivative social effects of converging material inventions. Effects of" +
            " Technology on major social institutions. social inventions. Urbanization and industrialization " +
            "in Bangladesh.</em></p><br>"+

            "<p><em><u>Sociology of Development</u>: Processes of development. Social Planning. Planning as a" +
            " factor of social change. Social Change in Bangladesh. Nature and trend.</em></p><br>"+

            "<p><em><u>Urban Ecology</u>: City, pre-industrial and industrial; growth and nature of cities in Bangladesh.</em></p><br>"+

            "<p><em><u>Rural Sociology</u>: Features of village community in Bangladesh. Social Mobility. " +
            "Urban Rural contrast. Social structure of the tribal people of Bangladesh.</em></p><br><br>"+

            "<h3><b><strong>(3) Principles of Accounting</strong></b></h3>"+
            "<h4><b><strong>3.00 credits, 3 hours/week</strong></b></h4>"+

            "<p><em>Accounting elements: the accounting equation, accounts, transactions, the double" +
            " entry mechanism. Accounting procedure: the financial statements.</em></p><br>"+

            "<p><em>Cost in general: objectives and classifications. overhead costs: allocation and" +
            " apportionment. Product costing: cost sheet under job costing, operating costing and " +
            "process costing. Costing of byproducts and joint products.</em></p><br>"+

            "<p><em>Marginal costing: tools and techniques, cost-volume-profit analysis. Designing " +
            "the optimal product-mix.</em></p><br>"+

            "<p><em>Relevant costing: analysis profitability within the firm. guidelines for decision" +
            " making: short-run decisions.</em></p><br>"+

            "<p><em>Long-run planning and control: capital budgeting. The master budget, flexible " +
            "budget and standard cost. Variance analysis.</em></p><br><br>"+

            "<b><font color=\"#0074D9\">1. The list of elective courses offered for each term will be made available for the students.</font></b><br><br>"+

            "<b><font color=\"#0074D9\">2. A maximum of 12.5 credits in Humanities will be counted for graduation.</font></b><br><br><br><br>";







    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.electivethirtyseven_fragment,container,false);
        webView36 = (WebView) view.findViewById(R.id.subthirtyseven);
        webView36.loadDataWithBaseURL(null,electivethirtyseventext,"text/html","utf-8",null);

        return view;
    }
}
