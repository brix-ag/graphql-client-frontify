package ch.brix.gql.client.frontify.interfaces;

/**
 * `CustomMetadataInterface` for `CustomMetadata` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.CustomMetadataValue.class, ch.brix.gql.client.frontify.objects.CustomMetadataValues.class})
public interface CustomMetadata {
  /**
   * `CustomMetadataProperty` details.
   */
  ch.brix.gql.client.frontify.objects.CustomMetadataProperty getProperty();
}
