package ch.brix.gql.client.frontify.enums;

public enum AssetProvenanceContentOrigin {
  /**
   * No AI was declared: either the credential positively attributes the content to real-world capture, human authorship, or an automated-but-not-AI source, or it declares no source type at all. Both reach the same conclusion — there is no evidence of AI — and this is not a claim that no AI was used.
   */
  @com.google.gson.annotations.SerializedName("NO_AI_DECLARED") 
  NO_AI_DECLARED,
  /**
   * Generative AI touched part of the content — for example an inpainted region on a photograph.
   */
  @com.google.gson.annotations.SerializedName("AI_ASSISTED") 
  AI_ASSISTED,
  /**
   * The content was created by a trained AI model.
   */
  @com.google.gson.annotations.SerializedName("AI_GENERATED") 
  AI_GENERATED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
