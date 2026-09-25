package ch.brix.gql.client.frontify.interfaces;

@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.CustomMetadataCatalogLinkCell.class, ch.brix.gql.client.frontify.objects.CustomMetadataCatalogTextCell.class})
public interface CustomMetadataCatalogCell {
  /**
   * **BETA** Catalog column of this cell readable through custom metadata visibility.
   */
  ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn getColumn();
}
