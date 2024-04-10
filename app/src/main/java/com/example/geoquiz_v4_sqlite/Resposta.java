package com.example.geoquiz_v4_sqlite;

import java.util.UUID;

public class Resposta {
    private UUID mId;
    private boolean mRespostaCorreta;
    private boolean mRespostaOferecida;
    private boolean mColou;

    public Resposta(UUID id, boolean respostaCorreta, boolean respostaOferecida, boolean colou) {
        mId = id;
        mRespostaCorreta = respostaCorreta;
        mRespostaOferecida = respostaOferecida;
        mColou = colou;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public boolean isRespostaCorreta() {
        return mRespostaCorreta;
    }

    public void setRespostaCorreta(boolean respostaCorreta) {
        mRespostaCorreta = respostaCorreta;
    }

    public boolean isRespostaOferecida() {
        return mRespostaOferecida;
    }

    public void setRespostaOferecida(boolean respostaOferecida) {
        mRespostaOferecida = respostaOferecida;
    }

    public boolean isColou() {
        return mColou;
    }

    public void setColou(boolean colou) {
        mColou = colou;
    }
}