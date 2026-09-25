package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateCatalogColumn extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateCatalogColumn> {
  public RootMutation_updateCatalogColumn() {
    super(new ch.brix.gql.client.Call<>("updateCatalogColumn", "UpdateCatalogColumn"));
  }
  public RootMutation_updateCatalogColumn args(RootMutation_updateCatalogColumn_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateCatalogColumn onUpdateCatalogColumn(On_UpdateCatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
