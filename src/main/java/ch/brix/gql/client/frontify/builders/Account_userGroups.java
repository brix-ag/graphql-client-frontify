package ch.brix.gql.client.frontify.builders;

public class Account_userGroups extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UserGroupItems> {
  public Account_userGroups() {
    super(new ch.brix.gql.client.Call<>("userGroups", "UserGroupItems"));
  }
  public Account_userGroups args(Account_userGroups_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Account_userGroups onUserGroupItems(On_UserGroupItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
