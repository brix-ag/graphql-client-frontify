package ch.brix.gql.client.frontify.builders;

public class Account_users extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UserItems> {
  public Account_users() {
    super(new ch.brix.gql.client.Call<>("users", "UserItems"));
  }
  public Account_users args(Account_users_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Account_users onUserItems(On_UserItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
