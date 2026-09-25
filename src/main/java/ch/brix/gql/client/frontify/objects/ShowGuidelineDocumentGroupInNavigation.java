package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ShowGuidelineDocumentGroupInNavigation {
  /**
   * **BETA** The ID of the guideline document group shown in the navigation.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** Whether or not the guideline document group is hidden in navigation.
   */
  @com.google.gson.annotations.SerializedName("isHiddenInNavigation")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isHiddenInNavigation;
}
