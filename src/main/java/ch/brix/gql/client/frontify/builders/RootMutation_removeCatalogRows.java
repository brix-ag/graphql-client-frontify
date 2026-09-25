package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeCatalogRows extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.unions.RemoveCatalogRows> {
  public RootMutation_removeCatalogRows() {
    super(new ch.brix.gql.client.Call<>("removeCatalogRows", "RemoveCatalogRows"));
  }
  public RootMutation_removeCatalogRows args(RootMutation_removeCatalogRows_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeCatalogRows onRemoveCatalogRowsSuccessful(On_RemoveCatalogRowsSuccessful typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootMutation_removeCatalogRows onRemoveCatalogRowsBlocked(On_RemoveCatalogRowsBlocked typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
