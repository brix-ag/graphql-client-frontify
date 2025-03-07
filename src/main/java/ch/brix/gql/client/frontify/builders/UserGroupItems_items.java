package ch.brix.gql.client.frontify.builders;

public class UserGroupItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.UserGroup>> {
  public UserGroupItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "UserGroup"));
  }
  public UserGroupItems_items onUserGroup(On_UserGroup typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
