package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeCatalogColumns extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.unions.RemoveCatalogColumns> {
  public RootMutation_removeCatalogColumns() {
    super(new ch.brix.gql.client.Call<>("removeCatalogColumns", "RemoveCatalogColumns"));
  }
  public RootMutation_removeCatalogColumns args(RootMutation_removeCatalogColumns_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeCatalogColumns onRemoveCatalogColumnsSuccessful(On_RemoveCatalogColumnsSuccessful typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootMutation_removeCatalogColumns onRemoveCatalogColumnsBlocked(On_RemoveCatalogColumnsBlocked typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
