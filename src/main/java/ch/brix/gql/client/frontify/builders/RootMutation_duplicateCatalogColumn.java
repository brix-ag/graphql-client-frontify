package ch.brix.gql.client.frontify.builders;

public class RootMutation_duplicateCatalogColumn extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DuplicateCatalogColumn> {
  public RootMutation_duplicateCatalogColumn() {
    super(new ch.brix.gql.client.Call<>("duplicateCatalogColumn", "DuplicateCatalogColumn"));
  }
  public RootMutation_duplicateCatalogColumn args(RootMutation_duplicateCatalogColumn_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_duplicateCatalogColumn onDuplicateCatalogColumn(On_DuplicateCatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
