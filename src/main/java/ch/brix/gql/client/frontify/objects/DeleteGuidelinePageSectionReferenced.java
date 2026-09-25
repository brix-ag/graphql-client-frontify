package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteGuidelinePageSectionReferenced {
  /**
   * **BETA** The references of the `Section` that should have been deleted.
   */
  @com.google.gson.annotations.SerializedName("references")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.GuidelinePageBlockLocation.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.GuidelinePageBlockLocation> references;
}
