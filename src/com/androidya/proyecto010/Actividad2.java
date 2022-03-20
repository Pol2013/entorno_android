package com.androidya.proyecto010;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Actividad2 extends Activity {
	private WebView webView1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actividad2);

		webView1 = (WebView) findViewById(R.id.webView1);

		Bundle bundle = getIntent().getExtras();
		webView1.loadUrl("http://" + bundle.getString("direccion"));
	}

	public void finalizar(View view) {
		finish();
	}
}