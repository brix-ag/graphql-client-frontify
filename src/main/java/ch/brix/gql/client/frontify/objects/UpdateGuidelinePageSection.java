package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateGuidelinePageSection {
  /**
   * **BETA** The `Section` that was modified.
   */
  @com.google.gson.annotations.SerializedName("section")
  private ch.brix.gql.client.frontify.objects.GuidelinePageSection section;
}
