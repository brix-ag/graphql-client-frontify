package ch.brix.gql.client.frontify.builders;

public class RootMutation_clearCatalogRow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ClearCatalogRow> {
  public RootMutation_clearCatalogRow() {
    super(new ch.brix.gql.client.Call<>("clearCatalogRow", "ClearCatalogRow"));
  }
  public RootMutation_clearCatalogRow args(RootMutation_clearCatalogRow_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_clearCatalogRow onClearCatalogRow(On_ClearCatalogRow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
