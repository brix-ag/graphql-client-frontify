package ch.brix.gql.client.frontify.builders;

public class UserGroup_users extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UserItems> {
  public UserGroup_users() {
    super(new ch.brix.gql.client.Call<>("users", "UserItems"));
  }
  public UserGroup_users args(UserGroup_users_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public UserGroup_users onUserItems(On_UserItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
