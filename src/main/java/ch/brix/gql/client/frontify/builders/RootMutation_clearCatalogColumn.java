package ch.brix.gql.client.frontify.builders;

public class RootMutation_clearCatalogColumn extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ClearCatalogColumn> {
  public RootMutation_clearCatalogColumn() {
    super(new ch.brix.gql.client.Call<>("clearCatalogColumn", "ClearCatalogColumn"));
  }
  public RootMutation_clearCatalogColumn args(RootMutation_clearCatalogColumn_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_clearCatalogColumn onClearCatalogColumn(On_ClearCatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
