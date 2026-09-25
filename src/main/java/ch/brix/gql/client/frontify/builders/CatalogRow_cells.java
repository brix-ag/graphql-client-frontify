package ch.brix.gql.client.frontify.builders;

public class CatalogRow_cells extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell>> {
  public CatalogRow_cells() {
    super(new ch.brix.gql.client.Call<>("cells", "CatalogCell"));
  }
  public CatalogRow_cells args(CatalogRow_cells_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public CatalogRow_cells onCatalogLinkCell(On_CatalogLinkCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CatalogRow_cells onCatalogTextCell(On_CatalogTextCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CatalogRow_cells onCatalogCell(On_CatalogCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
