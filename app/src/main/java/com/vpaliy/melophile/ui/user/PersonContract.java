package com.vpaliy.melophile.ui.user;

import android.support.annotation.NonNull;

import com.vpaliy.domain.model.Playlist;
import com.vpaliy.domain.model.Track;
import com.vpaliy.domain.model.User;
import com.vpaliy.melophile.ui.base.BasePresenter;
import com.vpaliy.melophile.ui.base.BaseView;

import java.util.List;

public interface PersonContract {

    interface View extends BaseView<Presenter> {
        void attachPresenter(@NonNull Presenter presenter);
        void showTracks(List<Track> tracks);
        void showPlaylists(List<Playlist> playlists);
        void showAvatar(String avatarUrl);
        void showDescription(String description);
        void showTitle(String title);
        void showFollowersCount(int count);
        void showLikedCount(int count);
        void showEmptyMediaMessage();
        void showEmptyMessage();
        void showErrorMessage();
        void showLoading();
        void hideLoading();
    }

    interface Presenter extends BasePresenter<View> {
        void attachView(@NonNull View view);
        void stop();
        void start(String id);
    }
}