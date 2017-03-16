package com.jorgechuc.android;



public class pregunta {
   Integer mIdResTexto;
    boolean mRespuestaVerdadera;

    public Integer getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmIdResTexto(Integer mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public boolean ismRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }

    public void setmRespuestaVerdadera(boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

    public pregunta(Integer mIdResTexto, boolean mRespuestaVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.mRespuestaVerdadera = mRespuestaVerdadera;


    }
}
