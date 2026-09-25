package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataCatalogCell extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataCatalogCell() {
    super(new ch.brix.gql.client.On("CustomMetadataCatalogCell"));
  }
  /**
   * **BETA** Catalog column of this cell readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogCell column(CustomMetadataCatalogCell_column callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
