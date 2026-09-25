package ch.brix.gql.client.frontify.interfaces;

@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.CustomMetadataCatalogLinkColumn.class, ch.brix.gql.client.frontify.objects.CustomMetadataCatalogTextColumn.class})
public interface CustomMetadataCatalogColumn {
  /**
   * **BETA** Opaque catalog column ID readable through custom metadata visibility.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * **BETA** Catalog column name readable through custom metadata visibility.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
}
