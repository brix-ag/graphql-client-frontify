package ch.brix.gql.client.frontify.builders;

public class On_CatalogTextCell extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogTextCell() {
    super(new ch.brix.gql.client.On("CatalogTextCell"));
  }
  /**
   * **BETA** `CatalogColumn` of the `CatalogCell`.
   */
  public On_CatalogTextCell column(CatalogTextCell_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `CatalogRow` of the `CatalogCell`.
   */
  public On_CatalogTextCell row(CatalogTextCell_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `value` of the `CatalogCell`.
   */
  public On_CatalogTextCell value() {
    _add_field("value");
    return this;
  }
}
