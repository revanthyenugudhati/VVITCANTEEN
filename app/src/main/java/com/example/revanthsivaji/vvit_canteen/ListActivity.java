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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        spmb=(Button)findViewById(R.id.spritemb);
        sppb=(Button)findViewById(R.id.spritemb);
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
        spp=(TextView)findViewById(R.id.spriteq);
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

    }


    public void spritemb(View view) {
    }

    public void spritepb(View view) {
    }
}
