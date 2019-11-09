package com.che.chemical.buet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mohammad Rayhan on 12/25/2018.
 */

public class FragmentMathtwentyone extends Fragment {
    View view;
    public FragmentMathtwentyone() {
    }
    private WebView webView20;
    String mathtwentyonetext="<h3><b><strong>Vector Analysis, Matrices, and Laplace Transform</strong></b></h3>"+
            "<h4><b><strong>4.00 credits, 4 hours/week</strong></b></h4>"+

            "<p><em><u>Vector Analysis</u>: Scalars and vectors, equality of vectors. Addition and subtraction " +
            "of vectors. Multiplication of vectors by scalars. Position vector of a point. Resolution " +
            "of vectors, Scalar and vector product of two vectors and their geometrical interpretation. " +
            "Triple products and multiple products.Application to geometry and mechanics. Linear " +
            "dependence and independence of vectors. Differentiation and integration of vectors " +
            "together with elementary applications. Definition of line, surface and volume integrals." +
            " Gradient, divergence and curl of point functions. Various formulae. Gauss’s theorem, " +
            "Stoke’s theorem, Green’s theorem and their applications.</em></p><br>"+

            "<p><em>Matrices: Definition of matrix. Different types of Matrices. Algebra of matrices." +
            " Adjoint and inverse of a matrix. Rank and elementary transformations of matrices, Normal" +
            " and canonical forms. Solution of linear equations. Quadratic forms. Matrix polynomials." +
            " Caley-Hamilton theorem. Eigenvalues and eigenvectors.</em></p><br>"+

            "<p><em>Laplace Transform: Definition. Laplace transforms of some elementary functions." +
            " Sufficient conditions for existence of Laplace transforms. Inverse Laplace transforms. " +
            "Laplace transforms of derivatives. The unit step function. Periodic function. Some special " +
            "theorems on Laplace transforms. Partial fraction. Solutions of differential equations by " +
            "Laplace transforms. Evaluation of improper integrals.</em></p><br><br>";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.mathtwentyone_fragment,container,false);
        webView20 = (WebView) view.findViewById(R.id.subtwentyone);
        webView20.loadDataWithBaseURL(null,mathtwentyonetext,"text/html","utf-8",null);

        return view;
    }
}
