package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetProvenance {
  /**
   * **BETA** Whether a credential was found, absent, could not be read, is still being extracted, or cannot be extracted for this file.
   */
  @com.google.gson.annotations.SerializedName("state")
  private ch.brix.gql.client.frontify.enums.AssetProvenanceState state;
  /**
   * **BETA** How the content was generated, derived from the credential's declared source types.
   */
  @com.google.gson.annotations.SerializedName("contentOrigin")
  private ch.brix.gql.client.frontify.enums.AssetProvenanceContentOrigin contentOrigin;
  /**
   * **BETA** Whether the credential itself could be confirmed.
   */
  @com.google.gson.annotations.SerializedName("certStatus")
  private ch.brix.gql.client.frontify.enums.AssetProvenanceCertStatus certStatus;
  /**
   * **BETA** Organization the signing certificate was issued to, as its subject.
   */
  @com.google.gson.annotations.SerializedName("certSubject")
  private ch.brix.gql.client.frontify.scalars.StringScalar certSubject;
  /**
   * **BETA** Name of the software that generated the content, as the credential declares it.
   */
  @com.google.gson.annotations.SerializedName("generatorName")
  private ch.brix.gql.client.frontify.scalars.StringScalar generatorName;
  /**
   * **BETA** Version of the generating software, as the credential declares it.
   */
  @com.google.gson.annotations.SerializedName("generatorVersion")
  private ch.brix.gql.client.frontify.scalars.StringScalar generatorVersion;
  /**
   * **BETA** Issuer of the signing certificate.
   */
  @com.google.gson.annotations.SerializedName("certIssuer")
  private ch.brix.gql.client.frontify.scalars.StringScalar certIssuer;
  /**
   * **BETA** When the signing certificate was issued.
   */
  @com.google.gson.annotations.SerializedName("certIssuedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar certIssuedAt;
  /**
   * **BETA** When the signing certificate expires.
   */
  @com.google.gson.annotations.SerializedName("certExpiresAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar certExpiresAt;
}
