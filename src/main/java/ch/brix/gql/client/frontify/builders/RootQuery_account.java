package ch.brix.gql.client.frontify.builders;

public class RootQuery_account extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Account> {
  public RootQuery_account() {
    super(new ch.brix.gql.client.Call<>("account", "Account"));
  }
  public RootQuery_account onAccount(On_Account typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
