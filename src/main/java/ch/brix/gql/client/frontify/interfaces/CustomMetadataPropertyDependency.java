package ch.brix.gql.client.frontify.interfaces;

/**
 * `CustomMetadataPropertyDependencyInterface` for `CustomMetadataPropertyDependency` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.CustomMetadataPropertySelectValueTypeDependencyTypeEquals.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertySelectValueTypeDependencyTypeOneOf.class, ch.brix.gql.client.frontify.objects.CustomMetadataPropertyValueTypeDependencyTypeFilled.class})
public interface CustomMetadataPropertyDependency {
  /**
   * The `CustomMetadataPropertyDependency` type.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getType();
  /**
   * The dependee `CustomMetadataProperty` Id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getPropertyId();
}
