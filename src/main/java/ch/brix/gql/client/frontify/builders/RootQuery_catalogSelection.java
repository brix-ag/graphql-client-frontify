package ch.brix.gql.client.frontify.builders;

public class RootQuery_catalogSelection extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CatalogSelection> {
  public RootQuery_catalogSelection() {
    super(new ch.brix.gql.client.Call<>("catalogSelection", "CatalogSelection"));
  }
  public RootQuery_catalogSelection args(RootQuery_catalogSelection_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_catalogSelection onCatalogSelection(On_CatalogSelection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
