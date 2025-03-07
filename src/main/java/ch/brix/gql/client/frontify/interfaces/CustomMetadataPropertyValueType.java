package ch.brix.gql.client.frontify.interfaces;

/**
 * `CustomMetadataPropertyValueTypeInterface` for `CustomMetadataPropertyValueType` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.CustomMetadataPropertyTextValueType.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyLongTextValueType.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyUrlValueType.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyNumberValueType.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyDateValueType.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertySelectValueType.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyMultiSelectValueType.class})
public interface CustomMetadataPropertyValueType {
  /**
   * The `CustomMetadataPropertyValueType` property type.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getPropertyType();
}
