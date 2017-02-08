package com.yuliya.retrofittest.base;

import com.yuliya.retrofittest.model.Repo;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Single;

/**
 * Created by Yuliya on 08.02.2017.
 */

public interface ReposeService {

    @GET("/users/{user}/repos")
    Single<List<Repo>> getRepos(@Path("user") String user);

}
