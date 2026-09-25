package ch.brix.gql.client.frontify.builders;

public class RootMutation_duplicateCatalogRow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DuplicateCatalogRow> {
  public RootMutation_duplicateCatalogRow() {
    super(new ch.brix.gql.client.Call<>("duplicateCatalogRow", "DuplicateCatalogRow"));
  }
  public RootMutation_duplicateCatalogRow args(RootMutation_duplicateCatalogRow_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_duplicateCatalogRow onDuplicateCatalogRow(On_DuplicateCatalogRow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
