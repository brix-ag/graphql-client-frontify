package ch.brix.gql.client.frontify.interfaces;

@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.CatalogLinkColumn.class, ch.brix.gql.client.frontify.objects.CatalogTextColumn.class})
public interface CatalogColumn {
  /**
   * **BETA** `CatalogColumn` ID.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * **BETA** `name` of the `CatalogColumn`.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
  /**
   * **BETA** `position` of the `CatalogColumn` for ordering.
   */
  ch.brix.gql.client.frontify.scalars.IntScalar getPosition();
}
