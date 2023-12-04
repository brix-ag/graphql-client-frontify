package ch.brix.gql.client.frontify.interfaces;

/**
 * `CustomMetadataPropertyTypeInterface` for `CustomMetadataPropertyType` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.CustomMetadataPropertyTypeText.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyTypeLongText.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyTypeUrl.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyTypeNumber.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyTypeDate.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyTypeSelect.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyTypeMultiSelect.class})
public interface CustomMetadataPropertyType {
  /**
   * The `CustomMetadataProperty` type name.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
}
