package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelinePageSection {
  /**
   * **BETA** `GuidelinePageSection` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** `GuidelinePageSectionElement` that are located within this `GuidelinePageSection`.
   */
  @com.google.gson.annotations.SerializedName("elements")
  private ch.brix.gql.client.frontify.objects.GuidelinePageSectionElementItems elements;
}
