package ch.brix.gql.client.frontify.interfaces;

@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.CatalogLinkCell.class, ch.brix.gql.client.frontify.objects.CatalogTextCell.class})
public interface CatalogCell {
  /**
   * **BETA** `CatalogColumn` of the `CatalogCell`.
   */
  ch.brix.gql.client.frontify.interfaces.CatalogColumn getColumn();
  /**
   * **BETA** `CatalogRow` of the `CatalogCell`.
   */
  ch.brix.gql.client.frontify.objects.CatalogRow getRow();
}
