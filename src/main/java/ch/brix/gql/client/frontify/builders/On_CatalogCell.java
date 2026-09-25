package ch.brix.gql.client.frontify.builders;

public class On_CatalogCell extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogCell() {
    super(new ch.brix.gql.client.On("CatalogCell"));
  }
  /**
   * **BETA** `CatalogColumn` of the `CatalogCell`.
   */
  public On_CatalogCell column(CatalogCell_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `CatalogRow` of the `CatalogCell`.
   */
  public On_CatalogCell row(CatalogCell_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
