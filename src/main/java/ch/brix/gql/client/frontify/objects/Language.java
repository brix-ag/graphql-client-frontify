package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Language {
  /**
   * **BETA** The ISO code of the language.
   */
  @com.google.gson.annotations.SerializedName("code")
  private ch.brix.gql.client.frontify.enums.LanguageCode code;
  /**
   * **BETA** The name of the language in English.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
}
