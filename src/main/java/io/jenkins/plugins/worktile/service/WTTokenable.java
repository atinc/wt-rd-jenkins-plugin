package io.jenkins.plugins.worktile.service;

import java.io.IOException;

import io.jenkins.plugins.worktile.model.WTTokenEntity;

public interface WTTokenable {
    WTTokenEntity getToken() throws IOException;

    void saveToken(WTTokenEntity token) throws IOException;
}