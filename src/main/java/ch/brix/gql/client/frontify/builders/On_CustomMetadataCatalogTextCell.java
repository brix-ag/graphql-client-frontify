package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataCatalogTextCell extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataCatalogTextCell() {
    super(new ch.brix.gql.client.On("CustomMetadataCatalogTextCell"));
  }
  /**
   * **BETA** Catalog column of this text cell readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogTextCell column(CustomMetadataCatalogTextCell_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Text cell value readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogTextCell value() {
    _add_field("value");
    return this;
  }
}
