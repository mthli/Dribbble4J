package Network;

import Dribbble.Bucket;
import Dribbble.Shot;
import Dribbble.User;
import retrofit.http.GET;
import retrofit.http.Path;

import java.util.List;

public class Service {
    // TODO Query/QueryMap
    public interface UserService {
        @GET(Rest.USER)
        public User getUser(@Path(Parameters.USER) int id);

        @GET(Rest.USER)
        public User getUser(@Path(Parameters.USER) String username);

        @GET(Rest.USER_BUCKETS)
        public List<Bucket> getUserBuckets(@Path(Parameters.USER) int id);

        @GET(Rest.USER_BUCKETS)
        public List<Bucket> getUserBuckets(@Path(Parameters.USER) String username);

        @GET(Rest.USER_FOLLOWERS)
        public List<User> getUserFollowers(@Path(Parameters.USER) int id);

        @GET(Rest.USER_FOLLOWERS)
        public List<User> getUserFollowers(@Path(Parameters.USER) String username);

        @GET(Rest.USER_FOLLOWING)
        public List<User> getUserFollowing(@Path(Parameters.USER) int id);

        @GET(Rest.USER_FOLLOWING)
        public List<User> getUserFollowing(@Path(Parameters.USER) String username);

        @GET(Rest.AUTHENTICATED_USER)
        public User getAuthenticatedUser();

        @GET(Rest.AUTHENTICATED_USER_BUCKETS)
        public List<Bucket> getAuthenticatedUserBuckets();

        @GET(Rest.AUTHENTICATED_USER_FOLLOWERS)
        public List<User> getAuthenticatedUserFollowers();

        @GET(Rest.AUTHENTICATED_USER_FOLLOWING)
        public List<User> getAuthenticatedUserFollowing();

        @GET(Rest.AUTHENTICATED_USER_FOLLOWING_SHOTS)
        public List<Shot> getAuthenticatedUserFollowingShots();

        // TODO
        @GET(Rest.IS_FOLLOWING)
        public boolean isFollowing(@Path(Parameters.USER) int id);

        // TODO
        @GET(Rest.IS_FOLLOWING)
        public boolean isFollowing(@Path(Parameters.USER) String username);
    }
}
