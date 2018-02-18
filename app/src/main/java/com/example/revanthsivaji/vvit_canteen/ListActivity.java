package com.example.revanthsivaji.vvit_canteen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {
    Button spmb,sppb,tumb,tupb,fmb,fpb,smb,spb;
    Button dmmb,dmpb,dmsmb,dmspb,kkmb,kkpb,fsmb,fspb,bomb,bopb,ppmb,pppb;
    Button dfmb,dfpb,hsmb,hspb,mmmb,mmpb,ubmb,ubpb,bmb,bpb,lmb,lpb,ppb,pmb,samb,sapb,tpb,tmb;
    Button rspb,rsmb,edspb,edsmb,fipb,fimb;
    TextView spq,spp,tuq,tup,fq,fp,sq,sp,dmq,dmp,dmsq,dmsp,kkq,kkp,fsq,fsp,boq,bop,ppq,ppp;
    TextView dfq,dfp,hsq,hsp,mmq,mmp,ubq,ubp,bq,bp,lp,lq,pq,pp,saq,sap,tp,tq,rsq,rsp,edsq,edsp,fip,fiq;
    int values=0,valuetu=0,valuef=0,valuesd=0,valrs=0,valeds=0,valfi=0,valp=0,valsa=0,valt=0;
    int sprite_p=0,tu_p=0,f_p=0,sd_p=0,rs_p=0,eds_p=0,fi_p=0,p_p=0,sa_p=0,t_p=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        spmb=(Button)findViewById(R.id.spritemb);
        sppb=(Button)findViewById(R.id.spritepb);
        tumb=(Button)findViewById(R.id.thumpsmb);
        tupb=(Button)findViewById(R.id.thumpspb);
        fmb=(Button)findViewById(R.id.fantamb);
        fpb=(Button)findViewById(R.id.fantapb);
        smb=(Button)findViewById(R.id.sodamb);
        spb=(Button)findViewById(R.id.sodapb);
        dmmb =(Button)findViewById(R.id.dmmb);
        dmpb=(Button)findViewById(R.id.dmpb);
        dmsmb=(Button)findViewById(R.id.dmsmb);
        dmspb=(Button)findViewById(R.id.dmspb);
        kkmb=(Button)findViewById(R.id.kkmb);
        kkpb=(Button)findViewById(R.id.kkpb);
        fsmb=(Button)findViewById(R.id.fsmb);
        fspb=(Button)findViewById(R.id.fspb);
        bomb=(Button)findViewById(R.id.bomb);
        bopb=(Button)findViewById(R.id.bopb);
        ppmb=(Button)findViewById(R.id.perkmb);
        pppb=(Button)findViewById(R.id.perkpb);
        dfmb=(Button)findViewById(R.id.dfmb);
        dfpb=(Button)findViewById(R.id.dfpb);
        hsmb=(Button)findViewById(R.id.hsmb);
        hspb=(Button)findViewById(R.id.hspb);
        mmmb=(Button)findViewById(R.id.mmmb);
        mmpb=(Button)findViewById(R.id.mmpb);
        ubmb=(Button)findViewById(R.id.ubmb);
        ubpb=(Button)findViewById(R.id.ubpb);
        bmb=(Button)findViewById(R.id.bingomb);
        bpb=(Button)findViewById(R.id.bingopb);
        lmb=(Button)findViewById(R.id.laysmb);
        lpb=(Button)findViewById(R.id.layspb);
        pmb=(Button)findViewById(R.id.puffmb);
        ppb=(Button)findViewById(R.id.puffpb);
        samb=(Button)findViewById(R.id.samosamb);
        sapb=(Button)findViewById(R.id.samosapb);
        tmb=(Button)findViewById(R.id.teamb);
        tpb=(Button)findViewById(R.id.teapb);
        rsmb=(Button)findViewById(R.id.rsmb);
        rspb=(Button)findViewById(R.id.rspb);
        edsmb=(Button)findViewById(R.id.edsmb);
        edspb=(Button)findViewById(R.id.edspb);
        fimb=(Button)findViewById(R.id.filemb);
        fipb=(Button)findViewById(R.id.filepb);
        spq=(TextView)findViewById(R.id.spriteq);
        spp=(TextView)findViewById(R.id.spritep);
        tuq=(TextView)findViewById(R.id.thumpsq);
        tup=(TextView)findViewById(R.id.thumpsp);
        fq=(TextView)findViewById(R.id.fantaq);
        fp=(TextView)findViewById(R.id.fantap);
        sq=(TextView)findViewById(R.id.sodaq);
        sp=(TextView)findViewById(R.id.sodap);
        dmq=(TextView)findViewById(R.id.dmq);
        dmp=(TextView)findViewById(R.id.dmp);
        dmsq=(TextView)findViewById(R.id.dmsq);
        dmsp=(TextView)findViewById(R.id.dmsp);
        kkq=(TextView)findViewById(R.id.kkq);
        kkp=(TextView)findViewById(R.id.kkp);
        fsq=(TextView)findViewById(R.id.fsq);
        fsp=(TextView)findViewById(R.id.fsp);
        boq=(TextView)findViewById(R.id.boq);
        bop=(TextView)findViewById(R.id.bop);
        ppq=(TextView)findViewById(R.id.perkq);
        ppp=(TextView)findViewById(R.id.perkp);
        dfq=(TextView)findViewById(R.id.dfq);
        dfp=(TextView)findViewById(R.id.dfp);
        hsq=(TextView)findViewById(R.id.hsq);
        hsp=(TextView)findViewById(R.id.hsp);
        mmq=(TextView)findViewById(R.id.mmq);
        mmp=(TextView)findViewById(R.id.mmp);
        ubq =(TextView)findViewById(R.id.ubq);
        ubp=(TextView)findViewById(R.id.ubp);
        bq=(TextView)findViewById(R.id.bingoq);
        bp=(TextView)findViewById(R.id.bingop);
        lq=(TextView)findViewById(R.id.laysq);
        lp=(TextView)findViewById(R.id.laysp);
        pq=(TextView)findViewById(R.id.puffq);
        pp=(TextView)findViewById(R.id.puffp);
        saq=(TextView)findViewById(R.id.samosaq);
        sap=(TextView)findViewById(R.id.samosap);
        tq=(TextView)findViewById(R.id.teaq);
        tp=(TextView)findViewById(R.id.teap);
        rsq=(TextView)findViewById(R.id.rsq);
        rsp=(TextView)findViewById(R.id.rsp);
        edsq=(TextView)findViewById(R.id.edsq);
        edsp=(TextView)findViewById(R.id.edsp);
        fiq=(TextView)findViewById(R.id.fileq);
        fip=(TextView)findViewById(R.id.filep);
        sppb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values=values+1;
                sprite_p=sprite_p+20;
                spq.setText(String.valueOf(values));
                spp.setText(String.valueOf(sprite_p));            }
        });
        spmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values=values-1;
                sprite_p=sprite_p-20;
                if(values<0)
                {
                    values=0;
                }
                if(sprite_p<0)
                {
                    sprite_p=0;
                }
                spq.setText(String.valueOf(values));
                spp.setText(String.valueOf(sprite_p));
            }
        });
        tupb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuetu=valuetu+1;
                tu_p=tu_p+20;
                tuq.setText(String.valueOf(valuetu));
                tup.setText(String.valueOf(tu_p));            }
        });
        tumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuetu=valuetu-1;
                tu_p=tu_p-20;
                if(valuetu<0)
                {
                    valuetu=0;
                }
                if(tu_p<0)
                {
                    tu_p=0;
                }
                tuq.setText(String.valueOf(valuetu));
                tup.setText(String.valueOf(tu_p));
            }
        });
        fpb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuef=valuef+1;
                f_p=f_p+20;
                fq.setText(String.valueOf(valuef));
                fp.setText(String.valueOf(f_p));            }
        });
        fmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuef=valuef-1;
                f_p=f_p-20;
                if(valuef<0)
                {
                    valuef=0;
                }
                if(f_p<0)
                {
                    f_p=0;
                }
                fq.setText(String.valueOf(valuef));
                fp.setText(String.valueOf(f_p));
            }
        });
        spb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuesd=valuesd+1;
                sd_p=sd_p+20;
                sq.setText(String.valueOf(valuesd));
                sp.setText(String.valueOf(sd_p));            }
        });
        smb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuesd=valuesd-1;
                sd_p=sd_p-20;
                if(valuesd<0)
                {
                    valuesd=0;
                }
                if(sd_p<0)
                {
                    sd_p=0;
                }
                sq.setText(String.valueOf(valuesd));
                sp.setText(String.valueOf(sd_p));
            }
        });
        ppb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valp=valp+1;
                p_p=p_p+15;
                pq.setText(String.valueOf(valp));
                pp.setText(String.valueOf(p_p));            }
        });
        pmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valp=valp-1;
                p_p=p_p-15;
                if(valp<0)
                {
                    valp=0;
                }
                if(p_p<0)
                {
                    p_p=0;
                }
                pq.setText(String.valueOf(valp));
                pp.setText(String.valueOf(p_p));
            }
        });
        sapb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valsa=valsa+1;
                sa_p=sa_p+10;
                saq.setText(String.valueOf(valsa));
                sap.setText(String.valueOf(sa_p));            }
        });
        samb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valsa=valsa-1;
                sa_p=sa_p-10;
                if(valsa<0)
                {
                    valsa=0;
                }
                if(sa_p<0)
                {
                    sa_p=0;
                }
                saq.setText(String.valueOf(valsa));
                sap.setText(String.valueOf(sa_p));
            }
        });
        tpb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valt=valt+1;
                t_p=t_p+20;
                tq.setText(String.valueOf(valt));
                tp.setText(String.valueOf(t_p));            }
        });
        tmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valt=valt-1;
                t_p=t_p-20;
                if(valuesd<0)
                {
                    valuesd=0;
                }
                if(sd_p<0)
                {
                    sd_p=0;
                }
                sq.setText(String.valueOf(valuesd));
                sp.setText(String.valueOf(sd_p));
            }
        });
        spb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuesd=valuesd+1;
                sd_p=sd_p+20;
                sq.setText(String.valueOf(valuesd));
                sp.setText(String.valueOf(sd_p));            }
        });
        smb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuesd=valuesd-1;
                sd_p=sd_p-20;
                if(valuesd<0)
                {
                    valuesd=0;
                }
                if(sd_p<0)
                {
                    sd_p=0;
                }
                sq.setText(String.valueOf(valuesd));
                sp.setText(String.valueOf(sd_p));
            }
        });
        spb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuesd=valuesd+1;
                sd_p=sd_p+20;
                sq.setText(String.valueOf(valuesd));
                sp.setText(String.valueOf(sd_p));            }
        });
        smb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuesd=valuesd-1;
                sd_p=sd_p-20;
                if(valuesd<0)
                {
                    valuesd=0;
                }
                if(sd_p<0)
                {
                    sd_p=0;
                }
                sq.setText(String.valueOf(valuesd));
                sp.setText(String.valueOf(sd_p));
            }
        });
        spb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuesd=valuesd+1;
                sd_p=sd_p+20;
                sq.setText(String.valueOf(valuesd));
                sp.setText(String.valueOf(sd_p));            }
        });
        smb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuesd=valuesd-1;
                sd_p=sd_p-20;
                if(valuesd<0)
                {
                    valuesd=0;
                }
                if(sd_p<0)
                {
                    sd_p=0;
                }
                sq.setText(String.valueOf(valuesd));
                sp.setText(String.valueOf(sd_p));
            }
        });


    }

}
