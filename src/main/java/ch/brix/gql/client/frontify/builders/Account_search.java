package ch.brix.gql.client.frontify.builders;

public class Account_search extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AccountSearchItems> {
  public Account_search() {
    super(new ch.brix.gql.client.Call<>("search", "AccountSearchItems"));
  }
  public Account_search args(Account_search_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Account_search onAccountSearchItems(On_AccountSearchItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
