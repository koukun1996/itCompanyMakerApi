package com.koukun.itCompanyMaker;

public class CompanyNameMaker {
	private final long id;
	private final String companyName;

	public CompanyNameMaker(long id, String companyName) {
		this.id = id;
		this.companyName = makeCompany(companyName);
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return companyName;
	}
//=================================================================================================================	
//	Private
//=================================================================================================================	
	/**
	 * 会社名作成処理
	 * @param content
	 * @return result 作成した会社名
	 */
	private String makeCompany(String companyName) {
		String[] firstParts = {"グローバル", "イノベーション", "インフォメーション", "デザイン", "エンジニアリング"};
		String[] secondParts = {"システム", "ソリューション", "サービス", "ジャパン", "テクノロジー", "ソフトウェア"};
		StringBuilder result = new StringBuilder();
		result.append(companyName)
		.append(firstParts[randomIndexNum(firstParts)])
		.append(secondParts[randomIndexNum(secondParts)]);
		
		return result.toString();
	}
	/**
	 * 配列のインデックスをランダムで決めてくれるメソッド
	 * @param strArray
	 * @return 受け取った配列のランダムなインデックス
	 */
	private static int randomIndexNum(String[] strArray) {
		return (int)(Math.random() * strArray.length); 
	}
}
