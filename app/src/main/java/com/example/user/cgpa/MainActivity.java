package com.example.user.cgpa;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);
        e5=(EditText)findViewById(R.id.e5);
        e6=(EditText)findViewById(R.id.e6);
        e7=(EditText)findViewById(R.id.e7);
        e8=(EditText)findViewById(R.id.e8);
        e9=(EditText)findViewById(R.id.e9);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String a,b,c,d,e,f,g,h;
        float p,q,r,s,t,u,w,x,i;
        if(v==b1)
        {
            a=e1.getText().toString();
            b=e2.getText().toString();
            c=e3.getText().toString();
            d=e4.getText().toString();
            e=e5.getText().toString();
            f=e6.getText().toString();
            g=e7.getText().toString();
            h=e8.getText().toString();
            if(a.equals("S"))
            p=10;
            else if(a.equals("A"))
            p=9;
            else if(a.equals("B"))
                p=8;
            else if(a.equals("C"))
                p=7;
            else if(a.equals("D"))
                p=6;
            else if(a.equals("E"))
            p=5;
            else
            p=4;
            if(b.equals("S"))
                q=10;
            else if(b.equals("A"))
                q=9;
            else if(b.equals("B"))
                q=8;
            else if(b.equals("C"))
                q=7;
            else if(b.equals("D"))
                q=6;
            else if(b.equals("E"))
                q=5;
            else
            q=4;
            if(c.equals("S"))
                r=10;
            else if(c.equals("A"))
                r=9;
            else if(c.equals("B"))
                r=8;
            else if(c.equals("C"))
                r=7;
            else if(c.equals("D"))
                r=6;
            else if(c.equals("E"))
                r=5;
            else
            r=4;
            if(d.equals("S"))
                s=10;
            else if(d.equals("A"))
                s=9;
            else if(d.equals("B"))
                s=8;
            else if(d.equals("C"))
                s=7;
            else if(d.equals("D"))
                s=6;
            else if(d.equals("E"))
                s=5;
            else
            s=4;
            if(e.equals("S"))
                t=10;
            else if(e.equals("A"))
                t=9;
            else if(e.equals("B"))
                t=8;
            else if(e.equals("C"))
                t=7;
            else if(e.equals("D"))
                t=6;
            else if(e.equals("E"))
                t=5;
            else
            t=4;
            if(f.equals("S"))
                u=10;
            else if(f.equals("A"))
                u=9;
            else if(f.equals("B"))
                u=8;
            else if(f.equals("C"))
                u=7;
            else if(f.equals("D"))
                u=6;
            else if(f.equals("E"))
                u=5;
            else
            u=4;
            if(g.equals("S"))
                w=10;
            else if(g.equals("A"))
                w=9;
            else if(g.equals("B"))
                w=8;
            else if(g.equals("C"))
                w=7;
            else if(g.equals("D"))
                w=6;
            else if(g.equals("E"))
                w=5;
            else
            w=4;
            if(h.equals("S"))
                x=10;
            else if(h.equals("A"))
                x=9;
            else if(h.equals("B"))
                x=8;
            else if(h.equals("C"))
                x=7;
            else if(h.equals("D"))
                x=6;
            else if(h.equals("E"))
                x=5;
            else
            x=4;
            p=p*4;
            q=q*4;
            r=r*3;
            s=s*3;
            t=t*3;
            u=u*2;
            w=w*2;
            x=x*2;
            i=(p+q+r+s+t+u+w+x)/23;
            e9.setText(String.valueOf(i));

        }

        if(v==b2)
        {
            e1.setText("");
            e2.setText("");
            e3.setText("");
            e4.setText("");
            e5.setText("");
            e6.setText("");
            e7.setText("");
            e8.setText("");
            e9.setText("");
            e1.requestFocus();
        }
    }
}
